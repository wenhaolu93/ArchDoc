package seg.jUCMNav.model.commands.create;

import org.eclipse.gef.commands.Command;

import grl.EvaluationStrategy;
import seg.jUCMNav.Messages;
import seg.jUCMNav.model.commands.JUCMNavCommand;
import urn.dyncontext.DynamicContext;

/**
 * This command adds a Strategy to the selected Dynamic Context
 * 
 * @author aprajita
 * 
 */
public class AddDynamicContextStrategyCommand extends Command implements JUCMNavCommand {
	
	private DynamicContext parent;
	private EvaluationStrategy child;
    boolean aborted = false;
    boolean isInCompoundCommand = false;

    /**
	 * Constructor
	 */
    public AddDynamicContextStrategyCommand(DynamicContext parent, EvaluationStrategy child) {
        this.parent = parent;
        this.child = child;
        setLabel(Messages.getString("AddDynamicContextStrategyCommand.AddDynamicContextStrategy")); //$NON-NLS-1$
    }

    /**
	 * 
	 */
    public AddDynamicContextStrategyCommand(DynamicContext parent, EvaluationStrategy child, boolean isInCompoundCommand) {
        this.parent = parent;
        this.child = child;
        setLabel(Messages.getString("AddDynamicContextStrategyCommand.AddDynamicContextStrategy")); //$NON-NLS-1$
        this.isInCompoundCommand = isInCompoundCommand;
    }

    /**
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute() {
        return parent != null && child != null && (isInCompoundCommand || parent.getUrnspec().getGrlspec().getStrategies().contains(child)) 
        		&& (parent.getStrategy() == null);
    }

    /**
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute() {
        redo();
    }

    /**
     * 
     * @see org.eclipse.gef.commands.Command#redo()
     */
    public void redo() {
        if (!canExecute()) {
            aborted = true; // another command in same compound command invalidated our preconditions
            return;
        }
        testPreConditions();
        if (parent.getStrategy() == null)
        	this.parent.setStrategy(child);
        testPostConditions();
    }

    /*
     * (non-Javadoc)
     * 
     * @see seg.jUCMNav.model.commands.JUCMNavCommand#testPostConditions()
     */
    public void testPostConditions() {
        assert parent != null && child != null : "post not null"; //$NON-NLS-1$
        assert  parent.getStrategy() == child : "post strategy not added"; //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see seg.jUCMNav.model.commands.JUCMNavCommand#testPreConditions()
     */
    public void testPreConditions() {
        assert parent != null && child != null : "pre not null"; //$NON-NLS-1$
        assert !( parent.getStrategy() == child) : "pre child not added"; //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.gef.commands.Command#undo()
     */
    public void undo() {
        if (aborted)
            return;
        testPostConditions();
        this.parent.setStrategy(null);
        testPreConditions();
    }

}

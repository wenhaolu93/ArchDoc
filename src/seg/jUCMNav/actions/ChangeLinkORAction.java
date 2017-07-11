package seg.jUCMNav.actions;

import fm.Feature;
import grl.Decomposition;
import grl.ElementLink;
import grl.IntentionalElement;
import grl.IntentionalElementRef;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;

import seg.jUCMNav.model.commands.transformations.ChangeLinkCommand;

/**
 * Action for changing a Feature's link type with its parent to OR.
 * 
 * @author Patrice Boulet
 * 
 */
public class ChangeLinkORAction extends ChangeLinkAction
{
    public static final String CHANGELINKOR = "seg.jUCMNav.ChangeLinkOR"; //$NON-NLS-1$
  
    private IntentionalElementRef elementRef;
    
    public ChangeLinkORAction(IWorkbenchPart part)
    {
        super(part);        
        setId(CHANGELINKOR);
    	relationship = ChangeLinkCommand.FEATURE_OR_RELATIONSHIP;
    }
    
    /**
     * True if we have selected a Feature and it's link type is not OR already.
     */
    @SuppressWarnings("static-access")
	protected boolean calculateEnabled() 
    {
    	@SuppressWarnings("unchecked")
		List<Object> objects = (List<Object>)getSelectedObjects();


        if (objects.size() != 1)
            return false;

        SelectionHelper sel = new SelectionHelper(objects);
        
        if (sel.getSelectionType() == sel.INTENTIONALELEMENTREF) {
            elementRef = sel.getIntentionalElementRef(); 
            if( elementRef.getDef() instanceof Feature){
            	
            	Feature feature = (Feature)elementRef.getDef();
            	if( feature.getLinksSrc().size() != 0){ 
	            	if ( feature.getLinksSrc().get(0) instanceof Decomposition ){
	            		IntentionalElement intElem = (IntentionalElement)((ElementLink)feature.getLinksSrc().get(0)).getDest();
	            		int decompType = intElem.getDecompositionType().getValue();
	            	
	            		if ( decompType == 1 ) /* OR */ {
	            			return false;
	            		}
	            	}
            	}
            	return true;
            }else
            	return false;
        } else
            return false;
  
    }
    
    /**
     * Trying to change the link type.
     * 
     */
    protected Command getCommand() 
    {
        return new ChangeLinkCommand(relationship, elementRef);
    }

}

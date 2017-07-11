package seg.jUCMNav.strategies;

import grl.Actor;
import grl.ActorRef;
import grl.GRLLinkableElement;
import grl.IntentionalElement;
import grl.IntentionalElementRef;

import java.util.ArrayList;
import java.util.Iterator;

import seg.jUCMNav.model.util.MetadataHelper;
import urncore.IURNContainerRef;
import urncore.IURNNode;
import urncore.URNmodelElement;

public class StrategyAlgorithmImplementationHelper {

    // reduce redundant code without using inheritance
	
    public static boolean isLegalStereotype(GRLLinkableElement element) {
        String value = MetadataHelper.getMetaData(element, "ST_Legal"); //$NON-NLS-1$
        return !"No".equalsIgnoreCase(value);
    }
    
    public static int defaultActorEvaluation(Actor actor)
    {
        int sumEval = 0;
        int sumImportance = 0;
        //To store already added elements in order to avoid duplicates(in case of more than one refernces)
        ArrayList<URNmodelElement> addedElts = new ArrayList<URNmodelElement>();
        
        Iterator iter = actor.getContRefs().iterator();
        while (iter.hasNext()) {
            // Parse through the node bound to this actor
            ActorRef ref = (ActorRef) iter.next();
            Iterator iterNode = ref.getNodes().iterator();
            while (iterNode.hasNext()) {
                IURNNode node = (IURNNode) iterNode.next();
                if (node instanceof IntentionalElementRef) {
                    IntentionalElementRef elementRef = (IntentionalElementRef) node;
                    IntentionalElement element = elementRef.getDef();
                    
                    //Skip this element if already added because of more than one references,else add it to the list
                    if (addedElts.contains(element))
                    	continue;
                    else
	                    addedElts.add(element);
                    
                    int evaluation = EvaluationStrategyManager.getInstance().getEvaluation(element);
                    int importance = element.getImportanceQuantitative();

                    if (importance != 0 && isLegalStereotype(element)) {
                        sumEval += evaluation * importance;
                        sumImportance += importance;
                    }
                }
            }
            
            iterNode = ref.getChildren().iterator();
            while (iterNode.hasNext()) {
                IURNContainerRef node = (IURNContainerRef) iterNode.next();
                if (node instanceof ActorRef) {
                    ActorRef elementRef = (ActorRef) node;
                    Actor element = (Actor) elementRef.getContDef();
                    
                    //Skip this actor if already added because of more than one references,else add it to the list
                    if (addedElts.contains(element))
                    	continue;
                    else
	                    addedElts.add(element);
                    
                    int evaluation = EvaluationStrategyManager.getInstance().getActorEvaluation(element);
                    int importance = element.getImportanceQuantitative();

                    if (importance != 0 && isLegalStereotype(element)) {
                        sumEval += evaluation * importance;
                        sumImportance += importance;
                    }
                }
            }
        }
        if (sumImportance > 0) {
            sumImportance = sumEval / sumImportance;
        }

        return sumImportance;
    }
}

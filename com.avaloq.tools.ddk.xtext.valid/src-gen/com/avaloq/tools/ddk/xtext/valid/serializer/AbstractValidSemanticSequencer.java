/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.xtext.valid.serializer;

import com.avaloq.tools.ddk.xtext.valid.services.ValidGrammarAccess;
import com.avaloq.tools.ddk.xtext.valid.valid.Category;
import com.avaloq.tools.ddk.xtext.valid.valid.DuplicateContext;
import com.avaloq.tools.ddk.xtext.valid.valid.Import;
import com.avaloq.tools.ddk.xtext.valid.valid.NativeContext;
import com.avaloq.tools.ddk.xtext.valid.valid.NativeRule;
import com.avaloq.tools.ddk.xtext.valid.valid.QuickFix;
import com.avaloq.tools.ddk.xtext.valid.valid.RangeRule;
import com.avaloq.tools.ddk.xtext.valid.valid.SimpleContext;
import com.avaloq.tools.ddk.xtext.valid.valid.SizeRule;
import com.avaloq.tools.ddk.xtext.valid.valid.UniqueRule;
import com.avaloq.tools.ddk.xtext.valid.valid.ValidModel;
import com.avaloq.tools.ddk.xtext.valid.valid.ValidPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractValidSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ValidGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ValidPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ValidPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case ValidPackage.DUPLICATE_CONTEXT:
				sequence_DuplicateContext(context, (DuplicateContext) semanticObject); 
				return; 
			case ValidPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ValidPackage.NATIVE_CONTEXT:
				sequence_NativeContext(context, (NativeContext) semanticObject); 
				return; 
			case ValidPackage.NATIVE_RULE:
				sequence_NativeRule(context, (NativeRule) semanticObject); 
				return; 
			case ValidPackage.QUICK_FIX:
				sequence_QuickFix(context, (QuickFix) semanticObject); 
				return; 
			case ValidPackage.RANGE_RULE:
				sequence_RangeRule(context, (RangeRule) semanticObject); 
				return; 
			case ValidPackage.SIMPLE_CONTEXT:
				sequence_SimpleContext(context, (SimpleContext) semanticObject); 
				return; 
			case ValidPackage.SIZE_RULE:
				sequence_SizeRule(context, (SizeRule) semanticObject); 
				return; 
			case ValidPackage.UNIQUE_RULE:
				sequence_UniqueRule(context, (UniqueRule) semanticObject); 
				return; 
			case ValidPackage.VALID_MODEL:
				sequence_ValidModel(context, (ValidModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING description=STRING? rules+=Rule*)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (contextType=[EClass|QualifiedID] contextFeature=[EStructuralFeature|ID]? markerType=[EClass|QualifiedID] markerFeature=[EStructuralFeature|ID]?)
	 */
	protected void sequence_DuplicateContext(EObject context, DuplicateContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     package=[EPackage|STRING]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ValidPackage.Literals.IMPORT__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ValidPackage.Literals.IMPORT__PACKAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getPackageEPackageSTRINGTerminalRuleCall_1_0_1(), semanticObject.getPackage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         contextType=[EClass|QualifiedID] 
	 *         contextFeature=[EStructuralFeature|ID]? 
	 *         (named?='as' givenName=ID)? 
	 *         (markerType=[EClass|QualifiedID] markerFeature=[EStructuralFeature|ID])? 
	 *         quickFixes+=QuickFix*
	 *     )
	 */
	protected void sequence_NativeContext(EObject context, NativeContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         optional?='optional'? 
	 *         checkKind=CheckKind? 
	 *         severity=SeverityKind 
	 *         name=ID 
	 *         label=STRING 
	 *         description=STRING? 
	 *         message=STRING 
	 *         contexts+=NativeContext+
	 *     )
	 */
	protected void sequence_NativeRule(EObject context, NativeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (quickFixKind=QuickFixKind? name=ID label=STRING message=STRING)
	 */
	protected void sequence_QuickFix(EObject context, QuickFix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         optional?='optional'? 
	 *         checkKind=CheckKind? 
	 *         severity=SeverityKind 
	 *         name=ID 
	 *         label=STRING 
	 *         description=STRING? 
	 *         message=STRING? 
	 *         min=INT? 
	 *         max=INT 
	 *         contexts+=SimpleContext+
	 *     )
	 */
	protected void sequence_RangeRule(EObject context, RangeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (contextType=[EClass|QualifiedID] contextFeature=[EStructuralFeature|ID]?)
	 */
	protected void sequence_SimpleContext(EObject context, SimpleContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         optional?='optional'? 
	 *         checkKind=CheckKind? 
	 *         severity=SeverityKind 
	 *         name=ID 
	 *         label=STRING 
	 *         description=STRING? 
	 *         message=STRING? 
	 *         min=INT? 
	 *         max=INT 
	 *         contexts+=SimpleContext+
	 *     )
	 */
	protected void sequence_SizeRule(EObject context, SizeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         optional?='optional'? 
	 *         checkKind=CheckKind? 
	 *         severity=SeverityKind 
	 *         name=ID 
	 *         label=STRING 
	 *         description=STRING? 
	 *         message=STRING? 
	 *         contexts+=DuplicateContext+
	 *     )
	 */
	protected void sequence_UniqueRule(EObject context, UniqueRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* categories+=Category*)
	 */
	protected void sequence_ValidModel(EObject context, ValidModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
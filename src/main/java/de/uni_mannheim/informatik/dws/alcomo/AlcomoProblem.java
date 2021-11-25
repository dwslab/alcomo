// *****************************************************************************
//
// Copyright (c) 2011 Christian Meilicke (University of Mannheim)
//
// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without restriction,
// including without limitation the rights to use, copy, modify, merge,
// publish, distribute, sublicense, and/or sell copies of the Software,
// and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included
// in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
// OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
// IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
// *********************************************************************************

package de.uni_mannheim.informatik.dws.alcomo;



import de.uni_mannheim.informatik.dws.alcomo.exceptions.AlcomoException;
import de.uni_mannheim.informatik.dws.alcomo.exceptions.PCFException;
import de.uni_mannheim.informatik.dws.alcomo.mapping.Mapping;
import de.uni_mannheim.informatik.dws.alcomo.ontology.LocalOntology;

public abstract class AlcomoProblem {
	
	
	protected LocalOntology sourceOntology;
	protected LocalOntology targetOntology;
	
	protected Mapping inputMapping;
	
	protected boolean solved;
	protected boolean initialized;
	
	public boolean solve() throws AlcomoException {
		if (!(this.initialized)) {
			this.init();
		}
		this.solved = true;
		return true;
	}
	
	public void init() throws AlcomoException  {
		this.initialized = true;
		this.checkBindings();
	}
	
	/**
	* Sets an ontology as source ontology.
	* 
	* @param sourceOntology The source ontology.
	* @throws PCFException Thrown if source ontology already has been specified.
	*/
	public void bindSourceOntology(LocalOntology sourceOntology) throws PCFException {
		if (this.sourceOntology != null) {
			throw new PCFException(
					PCFException.INVALID_OPERATION,
					"source ontology already bound"
			);
		}
		this.sourceOntology = sourceOntology;
	}
	
	/**
	* Sets an ontology as target ontology.
	* 
	* @param targetOntology The target ontology.
	* @throws PCFException Thrown if target ontology already has been specified. 
	*/	
	public void bindTargetOntology(LocalOntology targetOntology) throws PCFException {
		if (this.targetOntology != null) {
			throw new PCFException(
					PCFException.INVALID_OPERATION,
					"target ontology already bound"
			);
		}
		this.targetOntology = targetOntology;
	}
	
	/**
	* Sets a mapping as input mapping.
	* 
	* @param inputMapping Input mapping for source and target ontologies.
	* @throws PCFException Thrown if mapping has already been specified. 
	*/
	public void bindMapping(Mapping inputMapping) throws PCFException {
		if (this.inputMapping != null) {
			throw new PCFException(
					PCFException.INVALID_OPERATION,
					"mapping already bound"
			);
		}
		this.inputMapping = inputMapping.getCopy();		
	}
	
	
	protected void checkBindings() throws PCFException {
		if (this.inputMapping == null) {
			throw new PCFException(
				PCFException.MISSING_BINDING,
				"input mapping not specified"
			);
		}
		if ((this.sourceOntology == null) || (this.targetOntology == null)) {
			throw new PCFException(
					PCFException.MISSING_BINDING,
					"URI of source or target ontology not specified"
			);	
		}		
	}
	
}

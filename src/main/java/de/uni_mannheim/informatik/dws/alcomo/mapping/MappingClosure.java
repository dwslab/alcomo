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

package de.uni_mannheim.informatik.dws.alcomo.mapping;

/**
* Unready stuff, base4d on some idea that does not work for the banchmark testcase. 
*
*/
public class MappingClosure {
	
		
	
	public static Mapping getTransImpliedMapping(Mapping m1, Mapping m2) {
		
		for (Correspondence c1 : m1) {
			for (Correspondence c2 : m2) {
				if (c1.getTargetEntityUri().equals(c2.getSourceEntityUri())) {
					System.out.println(c1.toShortString() + " / " +  c2.toShortString());
					
				
					
					
					
				}
			}
		}
		return null;
	}
	

}

/**
* Copyright (c) 2013 The University of Texas at Dallas, Data Security and Privacy Lab. 
* All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this 
* file except in compliance with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software distributed 
* under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
* CONDITIONS OF ANY KIND, either express or implied. See the License for the specific 
* language governing permissions and limitations under the License. See accompanying
* LICENSE file.
*/

package edu.utdallas.bigsecret.cipher;


/**
 * Cipher class that uses built-in Javax library Cipher instances.
 */
public abstract class JavaxCipher extends Cipher
{
	/**
	 * Javax crypto instance.
	 */
	protected javax.crypto.Cipher m_cipher;
	
	/**
	 * Javax secret key spec instance. 
	 */
	protected javax.crypto.spec.SecretKeySpec m_keySpec;
	
	
	/**
	 * Default constructor.
	 * @throws Exception
	 */
	public JavaxCipher() throws Exception
	{
		
	}
}

/***
 * Copyright (c) 2011 Moises P. Sena - www.moisespsena.com
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.moisespsena.vraptor.modular;

/**
 * @author Moises P. Sena (http://moisespsena.com)
 * @since 1.0 26/08/2011
 */
public interface ModulePathResolver {
	public String getPrivateDirPath();

	/**
	 * Retorna o Endereco fisico do diretorio "/private" do JAR de um modulo
	 * apos ser configurado na aplicacao
	 * 
	 * @param module
	 *            Módulo
	 * @return endereço do diretorio
	 */
	public String getPrivateDirPath(Module module);

	/**
	 * Retorna o Endereco fisico do diretorio "/private" do JAR de um modulo
	 * 
	 * @param module
	 *            Módulo
	 * @return endereço do diretorio
	 */
	public String getPrivateDirSourcePath(Module module);

	/**
	 * Retorna o Endereco fisico do diretorio "/public" do JAR de um modulo apos
	 * ser configurado na aplicacao
	 * 
	 * @param module
	 *            Módulo
	 * @return endereço do diretorio
	 */
	public String getPublicDirPath(Module module);

	/**
	 * Retorna o Endereco fisico do diretorio "/public" do JAR de um modulo
	 * 
	 * @param module
	 *            Módulo
	 * @return endereço do diretorio
	 */
	public String getPublicDirSourcePath(Module module);
}
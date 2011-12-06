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

import java.lang.reflect.Method;

/**
 * Resolve o caminhos das views de um modulo
 * 
 * @author Moises P. Sena (http://moisespsena.com)
 * @since 1.0 26/08/2011
 */
public interface ModuleViewPathResolver {
	/**
	 * Endereco do arquivo Script de uma acao de um modulo
	 */
	public String getViewScriptPath(ModulePathResolver modulePathResolver,
			Module module, Class<?> controllerClass, Method actionMethod);

	/**
	 * Endereco do diretório de Scripts de um módulo
	 */
	public String getViewScriptsDirPath(ModulePathResolver modulePathResolver,
			Module module);

	/**
	 * Endereco do arquivo Script de uma acao de um modulo
	 */
	public String getViewScriptsDirPath(ModulePathResolver modulePathResolver,
			Module module, Class<?> controllerClass);

	/**
	 * Endereco do arquivo Script de uma acao de um modulo
	 */
	public String getViewsDirPath(ModulePathResolver modulePathResolver,
			Module module);
}
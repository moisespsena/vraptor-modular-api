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
package com.moisespsena.vraptor.modular;

import java.util.Set;

public interface ModulesFactory {

	/**
	 * Retorna o Modulo a partir de uma classe pertencente ao pacote basico do
	 * modulo
	 * 
	 * @param clazz
	 * @throws ModuleScanException
	 */
	public Module getModule(final Class<?> clazz);

	/**
	 * Retorna o modulo a partir das suas informacoes basicas
	 * 
	 * @param module
	 */
	public Module getModule(final Module module);

	/**
	 * Retorna o modulo pelo nome
	 * 
	 * @param name
	 */
	public Module getModule(final String name);

	public Set<Module> getModulesSet();
}

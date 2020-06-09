/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package for handing plugins.
 * 插件
 * 	MyBatis虽然功能强大，但并不能完美应用于所有场景，所以MyBatis提供了插件的接口，可以通过添加用户自定义插件的方式来对MyBatis进行扩展。用户自定义插件可以改变MyBatis的默认行为，例如：
 * 		可以拦截SQL语句对其重写
 *  但是在开始编写或使用MyBatis的自定义插件之前，需要先了解MyBatis内部的原理。这样才能编写出安全、高效的插件。
 */
package org.apache.ibatis.plugin;

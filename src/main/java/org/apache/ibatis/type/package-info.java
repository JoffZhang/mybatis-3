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
 * Type handlers.
 * 类型转换
 * 	1.MyBatis为简化配置文件提供了别名机制，该机制是类型转换模块的主要功能之一。
 * 	2.实现JDBC类型与JAVA类型之间的转换，该功能在为SQL语句绑定实参以及映射查询结果集时都会涉及
 * 		在为SQL语句绑定实参时，会将Java类型转换成JDBC类型
 * 		在映射结果集时，会将数据由JDBC类型转成Java类型
 */
package org.apache.ibatis.type;

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
 * Parsing utils
 * 解析器模块
 * 		对XPath进行封装，为MyBatis初始化时解析mybatis-config.xml配置文件以及映射配置文件提供支持
 * 		为处理动态sql语句中的占位符提供支持
 *
 * 	XPath是一门在XML文档中查找信息的语言，可以用来在XML文档中对元素和属性进行遍历。JDK1.5中提供了xpath的原生支持，mybatis即是使用的原生xpath。
 */
package org.apache.ibatis.parsing;

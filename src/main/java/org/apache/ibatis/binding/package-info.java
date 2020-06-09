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
 * Bings mapper interfaces with mapped statements
 * Bingding模块
 * 	在调用SqlSession相应方法执行数据库操作时，需要制定映射文件中定义的SQL节点，如果出现拼写错误，我们只能在运行时才能发现相应的异常。
 * 	为了尽早发现这种错误，MyBatis通过Binding模块，将用户自定义的Mapper接口与映射配置文件关联起来，系统可以通过调用自定义Mapper接口中的方法执行相应的sql语句完成数据库操作，从而避免上述问题。
 * 	注：开发人员无需编写自定义Mapper接口的实现，MyBatis会自动为其创建动态代理对象，在有些场景，自定义Mapper接口可以完全代替映射配置文件，但有的映射规则和SQL语句的定义还是写在映射配置文件中比较方便，如动态sql语句的定义。
 */
package org.apache.ibatis.binding;

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
 * Contains the statement executors.
 * 执行器
 * 		Executor主要负责一级缓存和二级缓存，并提供事务管理的相关操作，它会将数据库相关操作委托给StatementHandler完成
 * 		StatementHandler首先通过ParameterHandler完成SQL语句的实参绑定，然后通过java.sql.Statement对象执行sql语句并得到结果集，最后通过ResultSetHandler完成结果集的映射，得到对象结果并返回。
 */
package org.apache.ibatis.executor;

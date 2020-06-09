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
 * Base package. Contains the SqlSession.
 * 接口层
 * 		核心是SqlSession接口，该接口中定义了MyBatis暴露给应用程序调用的API，也就是上层应用于MyBatis交互的桥梁。
 * 	接口层在接收到请求时，会调用核心处理层的相应模块来完成具体的数据库操作。
 */
package org.apache.ibatis.session;

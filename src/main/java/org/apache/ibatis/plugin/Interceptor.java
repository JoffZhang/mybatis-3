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
package org.apache.ibatis.plugin;

import java.util.Properties;

/**
 * @author Clinton Begin
 * MyBatis允许用户使用自定义拦截器对SQL语句执行过程中的某一点进行拦截。
 * 默认情况下，MyBatis允许拦截器拦截
 * Executor的方法、
 * ParameterHandler的方法、
 * ResultSetHandler的方法
 * 以及StatementHandler的方法。
 * 具体可拦截的方法如下：
 * Executor中的update（）方法、query（）方法、flushStatements（）方法、commit（）方法、rollback()方法、getTransaction（）方法、close（）方法、isClosed（）方法。
 * ParameterHandler中的getParameterObject（）方法、setParameters（）方法。
 * ResultSetHandler中的handleResultSets（）方法、handleOutputParameters（）方法。
 * StatementHandler中的prepare（）方法、parameterize（）方法、batch（）方法、update（）方法、query（）方法。
 * MyBatis中使用的拦截器都需要实现Interceptor接口。Interceptor接口是MyBatis插件模块
 */
public interface Interceptor {
  //执行拦截逻辑的方法
  Object intercept(Invocation invocation) throws Throwable;
  //界定是否触发intercept()方法
  Object plugin(Object target);
  //根据配置初始化Interceptor对象
  void setProperties(Properties properties);

}

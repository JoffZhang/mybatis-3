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
 * The MyBatis data mapper framework makes it easier to use a relational database with object-oriented applications.
 */
package org.apache.ibatis;

/**
 *2.1 基础支持层
 * 基础支持层包含了整个MyBatis的基础模块，这些模块为核心处理层的功能提供了良好的支撑。
 *
 * 2.1.1反射模块
 * 源码位置：org.apache.ibatis.reflection
 *
 * MyBatis对Java原生的反射进行了良好的封装，提供了更加简洁易用的API，并对反射操作进行了一系列优化，例如缓存了类的元数据，提高了反射的性能。
 *
 * 2.1.2类型转换
 * 源码位置：org.apache.ibatis.type
 *
 * MyBatis 为简化配置文件提供了别名机制，该机制是类型转换模块的主要功能之一。
 * 实现 JDBC 类型与 Java 类型之间的转换,该功能在为SQL语句绑定实参以及映射查询结果集时都会涉及：
 * 在为 SQL 语句绑定实参时，会将数据由 Java 类型转换成 JDBC 类型。
 * 而在映射结果集时，会将数据由 JDBC 类型转换成 Java 类型。
 * 2.1.3日志模块
 * 源码位置：org.apache.ibatis.logging
 *
 * 为了方便开发人员定位BUG和甩锅，所以日志模块时非常重要的。MyBatis的日志模块当然不是自己实现了一套日志框架，日志模块就提供了集成第三方框架的功能。比如集成Log4j，slf4j等。
 *
 * 2.1.4资源加载模块
 * 源码位置：org.apache.ibatis.ioorg.apache.ibatis.io
 *
 * 资源加载模块，主要是对类加载器进行封装，确定类加载器的使用顺序，并提供了加载类文件以及其他资源文件的功能 。
 *
 * 2.1.5解析器模块
 * 源码位置：org.apache.ibatis.parsing
 *
 * 解析器模块主要提供了两个功能：
 * 对XPath进行封装，为MyBatis初始化时解析mybatis-config.xml配置文件以及映射配置文件提供支持；
 * 为处理动态SQL语句中的占位符提供支持；
 * 注：XPath是一门在XML文档中查找信息的语言，可以用来在XML文档中对元素和属性进行遍历。JDK1.5中提供了xpath的原生支持，mybatis即是使用的原生xpath。
 *
 * 2.1.6数据源模块
 * 源码位置：org.apache.ibatis.datasource
 *
 * MyBtais的数据源模块提供了相应的数据源实现，也提供了集成第三方数据源的接口。
 *
 * 2.1.7事务管理模块
 * 源码位置：org.apache.ibatis.transaction
 *
 * MyBatis 对数据库中的事务进行了抽象，其自身提供了相应的事务接口和简单实现。
 *
 * 在很多场景中，MyBatis 会与 Spring 框架集成，并由 Spring 框架管理事务。
 *
 * 2.1.8缓存模块
 * 源码位置：org.apache.ibatis.cache
 *
 * MyBatis中提供了一级缓存和二级缓存，这两级缓存都是依赖于基础支持层的缓存模块实现的。
 *
 * **注意：**MyBatis这两级缓存与MyBatis以及整个应用是运行在同一个JVM中的，共享同一块堆内存。所以这两级缓存中数据量过大时，应该考虑使用第三方缓存，例如Redis，Memcache等，否则可能会影响系统中其他功能的运行。
 *
 * 2.1.9Binding模块
 * 源码位置：org.apache.ibatis.binding
 *
 * 在调用 SqlSession 相应方法执行数据库操作时，需要指定映射文件中定义的 SQL 节点，如果出现拼写错误，我们只能在运行时才能发现相应的异常。为了尽早发现这种错误，MyBatis 通过 Binding 模块，将用户自定义的 Mapper 接口与映射配置文件关联起来，系统可以通过调用自定义 Mapper 接口中的方法执行相应的 SQL 语句完成数据库操作，从而避免上述问题。
 *
 * 值得读者注意的是，开发人员无须编写自定义 Mapper 接口的实现，MyBatis 会自动为其创建动态代理对象。在有些场景中，自定义 Mapper 接口可以完全代替映射配置文件，但有的映射规则和 SQL 语句的定义还是写在映射配置文件中比较方便，例如动态 SQL 语句的定义。
 *
 * 2.1.10注解模块
 * 源码位置：org.apache.ibatis.annotations
 *
 * 提供了在Mapper接口上编写SQL代码的功能；
 *
 * 2.1.11异常模块
 * 源码位置：org.apache.ibatis.exceptions
 *
 * 定义了MyBatis独有的PersistenceException和TooManyResultsException。嗯，这是MyBatis独享的momnet。
 *
 * 2.2核心处理层
 * 核心处理层中实现了MyBatis的核心处理流程，包括MyBatis的初始化以及完成一次数据库操作涉及的全部流程。
 *
 * 2.2.1配置解析
 * 源码位置：org.apache.ibatis.builder org.apache.ibatis.mapping builder包用来解析配置，mapping包用来完成SQL操作解析后的映射。
 *
 * 在 MyBatis 初始化的过程中，会加载 mybatis-config.xml 配置文件、映射配置文件以及 Mapper 接口中的注解信息，解析后的配置会形成相应的对象并保存到 Configuration 对象中。例如:
 *
 * 节点(即 ResultSet 的映射规则) 会被解析成 ResultMap 对象；
 * 节点(即属性映射) 会被解析成 ResultMapping 对象；
 * 之后利用该 Configuration 对象创建 SqlSessionFactory 对象。待 MyBtatis 初始化之后，可以通过初始化得到的 SqlSessionFactory 对象创建 SqlSession 对象并完成数据库操作。
 *
 * 2.2.2SQL解析
 * 源码位置：org.apache.ibatis.scripting
 *
 * MyBatis 中的 scripting 模块，会根据用户传入的实参，解析映射文件中定义的动态 SQL 节点，并形成数据库可执行的 SQL 语句。之后会处理 SQL 语句中的占位符，绑定用户传入的实参。
 *
 * 2.2.3SQL执行
 * 源码位置：org.apache.ibatis.executor org.apache.ibatis.cursor 前者对应执行器，后者对应执行结果的游标。
 *
 * SQL 语句的执行涉及多个组件 ，其中比较重要的是 Executor、StatementHandler、ParameterHandler 和 ResultSetHandler 。
 *
 * Executor 主要负责维护一级缓存和二级缓存，并提供事务管理的相关操作，它会将数据库相关操作委托给 StatementHandler完成。
 * StatementHandler 首先通过 ParameterHandler 完成 SQL 语句的实参绑定，然后通过 java.sql.Statement 对象执行 SQL 语句并得到结果集，最后通过 ResultSetHandler 完成结果集的映射，得到结果对象并返回。
 * 贴一下MyBatis执行SQL的流程图，图源：《MyBatis技术内幕》
 *
 *
 *
 * 2.2.4插件
 * 源码位置：org.apache.ibatis.plugin
 *
 * MyBatis虽然功能强大，但并不能完美应用于所有场景，所以MyBatis提供了插件的接口，可以通过添加用户自定义插件的方式来对MyBatis进行扩展。用户自定义插件可以改变MyBatis的默认行为，例如：
 *
 * 可以拦截SQL语句对其重写
 * 但是在开始编写或使用MyBatis的自定义插件之前，需要先了解MyBatis内部的原理。这样才能编写出安全、高效的插件。
 *
 * 2.3接口层
 * 源码位置：org.apache.ibatis.session
 *
 * 接口层相对简单，其核心是 SqlSession 接口，该接口中定义了 MyBatis 暴露给应用程序调用的 API，也就是上层应用与 MyBatis 交互的桥梁。接口层在接收到调用请求时，会调用核心处理层的相应模块来完成具体的数据库操作。
 *
 * 2.4其他
 * 介绍一下剩下的包是干嘛的。
 *
 * 2.4.1JDBC
 * 源码位置：org.apache.ibatis.jdbc
 *
 * JDBC单元测试工具类
 *
 * 2.4.2lang
 * 源码位置：org.apache.ibatis.lang
 *
 * 包下有 @UsesJava8 和 @UsesJava7 两个注解，从注释信息来看是用来标识哪些可以使用 JDK7 的API，哪些可以使用 JDK8 的API。
 *
 * 但是我搜索了一下MyBatis的源码，也没看到哪里有使用这个注解，暂时忽略了。
 */
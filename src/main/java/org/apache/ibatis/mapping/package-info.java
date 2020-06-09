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
 * TODO fillme.
 * 用来完成SQL操作解析后的映射
 *	MyBatis初始化过程中，会加载mybatis-config.xml配置文件、映射配置文件以及Mapper接口中的注解信息，解析后的配置会形成相应的对象并保存到Configuration对象中
 *如：
 * 	节点（即ResultSet的映射规则）会被解析成ResultMap对象；
 * 	节点（即属性映射）会被解析成ResultMapping对象；
 * 	之后利用Configuration对象创建SqlSessionFactory对象。待MyBatis初始化之后，可以通过初始化得到SqlSessionFactory对象创建SqlSession对象并完成数据库操作。
 *
 */
package org.apache.ibatis.mapping;

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
 * Base package for caching stuff
 * 缓存模块
 * 		MyBatis中提供了一级缓存和二级缓存，这两级缓存都是依赖于基础支持层的缓存模块实现的。
 * 		注：
 * 			MyBatis这两级缓存与MyBatis以及整个应用是运行在同一个JVM中的，共享同一块堆内存。
 * 		所以这两级缓存中数据量过大时，需要考虑第三方缓存，如redis，memcache等，否则可能会影响系统中的其他功能的运行
 */
package org.apache.ibatis.cache;

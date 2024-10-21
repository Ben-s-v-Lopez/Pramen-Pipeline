/*
 * Copyright 2022 ABSA Group Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package za.co.absa.pramen.api

case class SinkResult(
                       recordsSent: Long,
                       filesSent: Seq[String] = Seq.empty[String], // The list of files written. Empty list for non-file based sources.
                       hiveTables: Seq[String] = Seq.empty[String], // The list of Hive/Athena/Trino tables updated if any
                       warnings: Seq[String] = Seq.empty[String]
                     )

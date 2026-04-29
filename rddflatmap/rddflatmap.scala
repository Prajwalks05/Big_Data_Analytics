val textFile = sc.textFile("~/Desktop/wc.txt")

val counts = textFile
  .flatMap(line => line.split(" "))
  .map(word => (word, 1))
  .reduceByKey(_ + _)

import scala.collection.immutable.ListMap

val sorted = ListMap(
  counts.collect().sortWith((a, b) => a._2 > b._2): _*
)

println(sorted)

for ((k, v) <- sorted) {
  if (v > 4) {
    println(k + "," + v)
  }
}



fun main() {
println(fruits(listOf("mango","pineapple","orange","kiwi","apple","passion","grapes","guavas","avocado","berries")))
println(averageHeight(listOf(23.256,32.278,45.189,76.500,87.568)))
    var humanbeing = listOf(
        Humanbeing("Lona", 19, 56.5f, 78.5556),
        Humanbeing("Susan", 30, 48.12f, 56.890),
        Humanbeing("Jane", 16, 28.0f, 40.1222),
        Humanbeing("Ruth", 23, 59.45f, 70.789)
    )
    var sortAge = humanbeing.sortedByDescending { humanbeing -> humanbeing.age }
    println(sortAge)
    var two=addMore(mutableListOf(
        Humanbeing("cindy",56,34.72f,89.00),
        Humanbeing("juliana",90,60.67f,100.021)

    ))
    var together=humanbeing.plus(two)
    println(together)
    println(vehicle(listOf(
        Car("KBC12",10000),
        Car("KCA78",2000),
        Car("KDA65",5000))))

}

fun  fruits(characters:List<String>):List<String>{
       var filteredindex=characters.filterIndexed { index, s ->index%2==0}


       return filteredindex
}
data class averageSum(var sum:Double,var  average:Double)
fun averageHeight(height:List<Double>):averageSum{
       var sum=height.sum()
       var average=height.average()
       return  averageSum(average,sum)
}



data class Humanbeing (var name:String, var age:Int, var height: Float,var weight:Double)

fun addMore(humanbeing: MutableList<Humanbeing>):Any {
        return humanbeing
}
data class Car(var  registration:String,var mileage:Int)
        fun  vehicle(carlist:List<Car>):Int {
        var  totalmileage=0
        for(items in carlist){
         totalmileage+=items.mileage
        }
         return totalmileage/carlist.size

 }







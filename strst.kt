fun main()
{
    var t1=3.0
    var v1=0.0
    var t2=1.0
    var v2=6.0
    var t3=2.0
    var v3=5.0
    var way1=t1*v1
    var way2=t2*v2
    var way3=t3*v3
    var way=way1+way2+way3
    var wayp=way/2
    println(wayp)
    println(way1)
    println(way2)
    println(way3)
    if(wayp<=way1)
        print(wayp/v1)
    else if(wayp<=way2+way1)
        print((wayp-way1)/v2+t1)
    else if(wayp<=way)
        print((wayp-way1-way2)/v3+t1+t2)
    else
        print("error")
   
}




/*
fun timeForHalfWay(
    t1: Double, v1: Double,
    t2: Double, v2: Double,
    t3: Double, v3: Double
): Double =// TODO()
    if((t1*v1+t2*v2+t3*v3)/2<=t1*v1)
        (t1*v1+t2*v2+t3*v3)/2/v1
    else if((t1*v1+t2*v2+t3*v3)/2<=t2*v2+t1*v1)
        ((t1*v1+t2*v2+t3*v3)/2-t1*v1)/v2+t1
    else //if((t1*v1+t2*v2+t3*v3)/2<=t1*v1+t2*v2+t3*v3)
        ((t1*v1+t2*v2+t3*v3)/2-t1*v1-t2*v2)/v3+t1+t2
*/

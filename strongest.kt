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
   /* var matrix_size=6;
    var array = Array(matrix_size, {IntArray(matrix_size)});
    var k=3;
    var j=2;
    array[k][j]=1;
    var u=1;
    while(u==1)
    {
    var press= readLine()!!.toString();
        array[k][j]=0;
        when(press) {
        "w" -> if(j>0)j--;
        "a" -> if(k>0)k--;
        "s" -> if(j<matrix_size-1)j++;
        "d" -> if(k<matrix_size-1)k++;
    }
        array[k][j]=1;
        for (y in 0..matrix_size - 1) {
            for (x in 0..matrix_size - 1)
                print(array[x][y]);
            println();
        }
    }*/
}
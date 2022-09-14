fun main(args: Array<String>) {
    var zoos : String? = readLine()
    var Zs : Int = 0
    var Os : Int = 0
    for (i in 0 .. zoos!!.lastIndex){
        if (zoos[i] == 'z' || zoos[0] == 'Z'){
            Zs++
        }else if(zoos[i] == 'o' || zoos[i] == 'O'){
            Os++
        }
    }
    if (Os == (2*Zs)){
        println("Yes")
    }else {
        println("No")
    }
}
class StockType (val id: Int, val type: Int, val Data: String)

/*
	Please define the type appropriately for your project.
	
	in my project
	1 : Add Note
	2 : Modify Note(r_img, l_img, _classtype, solv_title)
	3 : Remove Note
	4 : Start Exam
	5 : ReStart Exam
*/

fun input(input: ArrayList<StockType>, isOnline: Boolean): ArrayList<StockType> {
	print("Input Data : ")
	val type = readLine()!!
	val max = input.size
	if(!isOnline){
		if(max==0)
			for(i in 0..type.split(" ").size-1){
				print("Data : ")
				val _data = readLine()!!
				input.add(StockType(i+1, type.split(" ")[i].toInt(), _data))
			}
		else
			for(i in 0..type.split(" ").size-1){
				print("Data : ")
				val _data = readLine()!!
				input.add(StockType(i+1+max, type.split(" ")[i].toInt(), _data))
			}
	}
		
	else
		println("Push Data to Server")
	return input
}

fun network(isOnline: Boolean): Boolean {
	return !isOnline
}

fun printAll(input: ArrayList<StockType>, isOnline: Boolean) {
	if(isOnline)
		println("Connected On Server!!!")
	else
		println("Not Connected...")
	
	for(i in 0..input.size-1)
		println("id: " + input[i].id + ", type: " + input[i].type + ", Data: " + input[i].Data)
}

fun push(input: ArrayList<StockType>, isOnline: Boolean): ArrayList<StockType> {
	if(!isOnline) {
		println("Can not Push Data")
	} else {
		input.clear()
		println("Push Data to Server")
	}
	return input
}

fun main(args: Array<String>) {
	var looping = true
	var isOnline: Boolean = true
	var Data = ArrayList<StockType>()
	while(looping) {
		println("********************************")
		println("1. Input Data                   ")
		println("2. Control Network              ")
		println("3. Print Data / Network         ")
		println("4. Push Data                    ")
		println("5. Exit                         ")
		println("********************************")
		print("Enter : ")
		val select = readLine()!!
		when(select.toInt()) {
			1 -> Data = input(Data, isOnline)
			2 -> isOnline = network(isOnline)
			3 -> printAll(Data, isOnline)
			4 -> Data = push(Data, isOnline)
			5 -> looping=false
		}
	}
}
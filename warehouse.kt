class StockType (val id: Int, val type: Int, val Data: String)

/*
	Please define the type appropriately for your project.
	
	in my project
	1 : Add Note(id, r_img, l_img, _classtype, solv_title)
	2 : Modify Note(id, r_img, l_img, _classtype, solv_title)
	3 : Remove Note(id)
	4 : Start Exam(id, noteList)
	5 : ReStart Exam(id)
*/

fun input(input: ArrayList<StockType>, isOnline: Boolean): ArrayList<StockType> {
	print("Input Data : ")
	val type = readLine()!!
	val max = input.size
	if(!isOnline){
		if(max==0){
			for(i in 0..type.split(" ").size-1){
				when(type.split(" ")[i].toInt()){
					1 -> {
						var str: String = "{\n"
						for(j in 1..5) {
							if(j==1){
								print("id: ")
								val _input = readLine()!!
								str+="\t\""+"id"+"\": "+_input+",\n"
							} else if(j==2) {
								print("r_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"r_img_id"+"\": "+_input+",\n"
							} else if(j==3) {
								print("l_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"l_img_id"+"\": "+_input+",\n"
							} else if(j==4) {
								print("_classType: ")
								val _input = readLine()!!
								str+="\t\""+"_classType"+"\": "+_input+",\n"
							} else if(j==5) {
								print("solv_title: ")
								val _input = readLine()!!
								str+="\t\""+"solv_title"+"\": \""+_input+"\",\n"
							}
						}
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
					2 -> {
						var str: String = "{\n"
						for(j in 1..5) {
							if(j==1){
								print("id: ")
								val _input = readLine()!!
								str+="\t\""+"id"+"\": "+_input+",\n"
							} else if(j==2) {
								print("r_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"r_img_id"+"\": "+_input+",\n"
							} else if(j==3) {
								print("l_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"l_img_id"+"\": "+_input+",\n"
							} else if(j==4) {
								print("_classType: ")
								val _input = readLine()!!
								str+="\t\""+"_classType"+"\": "+_input+",\n"
							} else if(j==5) {
								print("solv_title: ")
								val _input = readLine()!!
								str+="\t\""+"solv_title"+"\": \""+_input+"\",\n"
							}
						}
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
					3 -> {
						var str: String = "{\n"
						print("id: ")
						val _input = readLine()!!
						str+="\t\""+"id"+"\": "+_input+",\n"
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
					4 -> {
						var str: String = "{\n"
						for(j in 1..2) {
							if(j==1){
								print("id: ")
								val _input = readLine()!!
								str+="\t\""+"id"+"\": "+_input+",\n"
							} else if(j==2) {
								print("noteList: ")
								val _input = readLine()!!
								var test = "["
								for (k in 0.._input.split(",").size-1)
									test+=_input.split(",")[k]+","
								test+="]"
								str+="\t\""+"noteList"+"\": "+test+",\n"
							}
						}
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
					5 -> {
						var str: String = "{\n"
						print("id: ")
						val _input = readLine()!!
						str+="\t\""+"id"+"\": "+_input+",\n"
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
				}
			}
		} else {
			for(i in 0..type.split(" ").size-1){
				when(type.split(" ")[i].toInt()){
					1 -> {
						var str: String = "{\n"
						for(j in 1..5) {
							if(j==1){
								print("id: ")
								val _input = readLine()!!
								str+="\t\""+"id"+"\": "+_input+",\n"
							} else if(j==2) {
								print("r_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"r_img_id"+"\": "+_input+",\n"
							} else if(j==3) {
								print("l_img_id: ")
								val _input = readLine()!!
								str+="\t\""+"l_img_id"+"\": "+_input+",\n"
							} else if(j==4) {
								print("_classType: ")
								val _input = readLine()!!
								str+="\t\""+"_classType"+"\": "+_input+",\n"
							} else if(j==5) {
								print("solv_title: ")
								val _input = readLine()!!
								str+="\t\""+"solv_title"+"\": \""+_input+"\",\n"
							}
						}
						str+="}\n"
						input.add(StockType(i+1, type.split(" ")[i].toInt(), str))
					}
					2 -> {
						print("Data2 : ")
						val _data = readLine()!!
						input.add(StockType(i+1+max, type.split(" ")[i].toInt(), _data))
					}
					3 -> {
						print("Data3 : ")
						val _data = readLine()!!
						input.add(StockType(i+1+max, type.split(" ")[i].toInt(), _data))
					}
					4 -> {
						print("Data4 : ")
						val _data = readLine()!!
						input.add(StockType(i+1+max, type.split(" ")[i].toInt(), _data))
					}
					5 -> {
						print("Data5 : ")
						val _data = readLine()!!
						input.add(StockType(i+1+max, type.split(" ")[i].toInt(), _data))
					}
				}
			}
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
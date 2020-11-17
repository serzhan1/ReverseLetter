class ReverseLetter {
   fun reverseLetter(str:String): String = str.replace(Regex("[\\W\\d\\s_]"),"").reversed()
}


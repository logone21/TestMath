package com.example.test

class Math {
    fun add(a: String, b: String): String {
        var result = ""
        if (b == "" || a == "") {
            result = "Поле не заполнено"
        } else if (a.contains(".") || b.contains(".")) {
            var num1 = a.toDouble()
            var num2 = b.toDouble()
            result = (num1 + num2).toString()
        }else if (a.contains(Regex("[/!@^[-.№%?&'()іңғүұқөһӘҢҒҰҚӨ]*\$]"))||
            b.contains(Regex("[/!@^[-.№%?&'()әңғүұқөһӘҢҒҰҚӨ]*\$]"))) {
            result = "Символы вводить нельзя"
        }else if (a.contains(Regex("[A-zА-я]"))||b.contains(Regex("[A-zА-я]"))){
            result = "Буквы вводить нельзя"
        }else if (a.contains("-")|| b.contains("-")) {
                result = "Отрицательные числа вводить нельзя"
            }else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            result = (num1 + num2).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (b == "0") {
            result = "На 0 делить нельзя"
        } else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            result = (num1 / num2).toString()
        }

        return result
    }
}
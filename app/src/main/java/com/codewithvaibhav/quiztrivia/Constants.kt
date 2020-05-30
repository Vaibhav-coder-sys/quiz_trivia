package com.codewithvaibhav.quiztrivia

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1=Question(
            1,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Belgium",
            "Brazil",
            1)

        questionsList.add(que1)

        val que2=Question(
            2,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Belgium",
            "Brazil",
            2)

        questionsList.add(que2)

        val que3=Question(
            3,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Belgium",
            "Brazil",
            3)

        questionsList.add(que3)

        val que4=Question(
            4,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Australia",
            "Belgium",
            "Brazil",
            4)

        questionsList.add(que4)

        val que5=Question(
            5,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Fiji",
            "Germany",
            "India",
            1)

        questionsList.add(que5)

        val que6=Question(
            6,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Denmark",
            "Fiji",
            "Germany",
            "India",
            2)

        questionsList.add(que6)

        val que7=Question(
            7,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Denmark",
            "Fiji",
            "Germany",
            "India",
            3)

        questionsList.add(que7)

        val que8=Question(
            8,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "Denmark",
            "Fiji",
            "Germany",
            "India",
            4)

        questionsList.add(que8)

        val que9=Question(
            9,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "New Zeland",
            "Belgium",
            "Brazil",
            1)

        questionsList.add(que9)

        val que10=Question(
            10,
            "Which country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "Kuwait",
            "New Zeland",
            "Belgium",
            "Brazil",
            2)

        questionsList.add(que10)

        return questionsList


    }
}
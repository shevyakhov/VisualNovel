package com.example.visualnovel

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
  private var thisSlide = QuestRepository().getQuestionById(0)
    //получение имени
    private fun insertName(name:String) {
        storyTitle.text = storyTitle.text.replaceRange(
            storyTitle.text.lastIndexOf('$'),
            storyTitle.text.lastIndexOf('$') + 1,
            name
        )

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        //сюжетные ссылки с поправкой на номера(теперь отсчет не с 3 экрана а с 0)
        val nameIntent = intent
        val getName = nameIntent.getStringExtra(USERNAME)


        fun switchContent() {
            storyTitle.text = getString(thisSlide.TitleText)
            storybg.setImageResource(thisSlide.backgr)

            when (thisSlide.someAnswers.size) {
                1 -> {
                    caseSecond.text = getString(thisSlide.someAnswers[0].text)
                    caseThird.visibility = View.INVISIBLE
                    caseFirst.visibility = View.INVISIBLE

                }
                2 -> {
                    caseSecond.text = getString(thisSlide.someAnswers[0].text)
                    caseThird.text = getString(thisSlide.someAnswers[1].text)
                    caseFirst.visibility = View.INVISIBLE
                }
                3 -> {
                    caseFirst.text = getString(thisSlide.someAnswers[0].text)
                    caseSecond.text = getString(thisSlide.someAnswers[1].text)
                    caseThird.text = getString(thisSlide.someAnswers[2].text)
                    caseSecond.visibility = View.VISIBLE
                    caseThird.visibility = View.VISIBLE
                    caseFirst.visibility = View.VISIBLE
                }
            }
        }


        fun getItDone(index: Int) {
            thisSlide = QuestRepository().getQuestionById(index)
            switchContent()
        }

        //дефолтное отображение
        switchContent()
        insertName(getName.toString())

        //обработчики нажатий

        caseFirst.setOnClickListener {
            getItDone(thisSlide.someAnswers[0].nextid)
        }

        caseSecond.setOnClickListener {
            when (thisSlide.someAnswers.size) {
                1 -> {
                    intent = Intent(this, EndActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    startActivity(intent)
                    finish()
                }
                2 -> getItDone(thisSlide.someAnswers[0].nextid)
                3 -> getItDone(thisSlide.someAnswers[1].nextid)
            }

        }
        caseThird.setOnClickListener {
            when (thisSlide.someAnswers.size) {
                2 -> getItDone(thisSlide.someAnswers[1].nextid)
                3 -> getItDone(thisSlide.someAnswers[2].nextid)
            }

        }
    }
}
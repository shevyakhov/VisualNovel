package com.example.visualnovel

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    var currentSlide = 0 //номер слайда 0 по умолчанию

    //получение имени
    val nameIntent = intent
    val getName = nameIntent.getStringExtra(USERNAME)
    val FirstBtnIndex = 0
    val SecondBtnIndex = 1
    val ThirdBtnIndex = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        //сюжетные ссылки с поправкой на номера(теперь отсчет не с 3 экрана а с 0)


        val nextSlides = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5),
            arrayOf(4, 5),
            arrayOf(4, 5),
            arrayOf(6, 7),
            arrayOf(4, 8),
            arrayOf(-1),//-1 это считай флаг для перехода на последний слайд
            arrayOf(-1),
            arrayOf(9, 10),
            arrayOf(-1),
            arrayOf(-1)
        )

        // сюжетные кнопки
        val plotBut = arrayOf(
            arrayOf("Пойдем на пробежку", "Пойдем в поход", "Погуляем по полю"),
            arrayOf("Да, и посмотрим фильм", "Да, и отпразднуем хэллоуин"),
            arrayOf("Пойдем домой и посмотрим фильм", "Пойдем домой и отпразднуем Хэллоуин"),
            arrayOf("Может, посмотрим фильм?", "Да, отпразднуем Хэллоуин"),
            arrayOf("Мне понравился!", "Не очень..."),
            arrayOf("Да! Может, посмотрим фильм?", "Да! Давай сделаем костюмы!"),
            arrayOf("Да, уже поздно..."),
            arrayOf("Да, уже поздно..."),
            arrayOf("Твой тоже очень красивый!", "А мне, если честно, не нравится твой..."),
            arrayOf("Да, уже поздно..."),
            arrayOf("Да, уже поздно...")
        )
        //сюжетный заголовок
        val plotTitle = arrayOf(
            "Отлично, $getName! Чем займемся?",
            "Может, пойдем домой?..",
            "Как уютно... Но уже темнеет.",
            "Тебе грустно... Пойдем домой?",
            "Как тебе фильм?",
            "Получается очень красиво!",
            "Отлично! А теперь пора спать...",
            "Жаль... Тогда пойдем спать?",
            "Мне нравится твой костюм.",
            "Спасибо! Ну, пойдем спать?",
            "Ничего, я не в обиде. Пойдем спать?"
        )
        //бэкграунд
        val plotBg = arrayOf(
            R.drawable.kirya,
            R.drawable.run,
            R.drawable.camping,
            R.drawable.sad,
            R.drawable.film,
            R.drawable.decor,
            R.drawable.film,
            R.drawable.film,
            R.drawable.holiday,
            R.drawable.holiday,
            R.drawable.holiday,
        )


        fun switchContent() {
            storyTitle.text = plotTitle[currentSlide]
            storybg.setImageResource(plotBg[currentSlide])

            when (nextSlides[currentSlide].size) {
                1 -> {
                    caseFirst.text = plotBut[currentSlide][0]
                    caseSecond.visibility = View.INVISIBLE
                    caseThird.visibility = View.INVISIBLE
                }
                2 -> {
                    caseFirst.text = plotBut[currentSlide][0]
                    caseSecond.text = plotBut[currentSlide][1]
                    caseSecond.visibility = View.VISIBLE
                    caseThird.visibility = View.INVISIBLE
                }
                3 -> {
                    caseFirst.text = plotBut[currentSlide][0]
                    caseSecond.text = plotBut[currentSlide][1]
                    caseThird.text = plotBut[currentSlide][2]
                    caseSecond.visibility = View.VISIBLE
                    caseThird.visibility = View.VISIBLE
                }
            }
        }


        fun getItDone(index: Int) {
            currentSlide = nextSlides[currentSlide][index]
            switchContent()
        }
        //дефолтное отображение
        switchContent()

        //обработчики нажатий
        caseFirst.setOnClickListener {
            getItDone(FirstBtnIndex)
        }
        caseSecond.setOnClickListener {
            if (nextSlides[currentSlide][0] == -1) {
                intent = Intent(this, EndActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)

            } else {
                getItDone(SecondBtnIndex)
            }

        }
        caseThird.setOnClickListener {
            getItDone(ThirdBtnIndex)
        }


    }
}
require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Приветики

    state: Dela

        random: 
            a: Все отлично!
            a: Честно говоря. бывало и лучше..
            a: Ой, да вроде все нормально
            a: Ну, вообще я робот и у меня нет чувств

    state: Bye
        intent!: /пока
        a: До новых встреч!

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Matcha
        event!: match
        a: {{$context.intent.answer}}
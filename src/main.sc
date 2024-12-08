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
            q!: /как дела
            a: Все отлично! 

    state: Bye
        intent!: /пока
        a: До новых встречь!

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Matcha
        event!: match
        a: {{$context.intent.answer}}
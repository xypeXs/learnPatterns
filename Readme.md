# Паттерны проектирования архитектуры приложений

Паттерны и принципы проектирования нужно применять обдуманно и осторожно. Они могут привести как к улучшению архитектуры приложения, так и
к усложнению кода, удорожанию сопровождения и разработки. Перед использованием паттернов и принципов проектирования необходимо
детально рассмотреть случай их применения, оценить все преимущества и недостатки и принять решение об их применимости.

## Принципы проектирования:
1. **Выделите аспекты приложения, которые могут изменяться, и отделите их от тех, которые всегда остаются постоянными**

    Выделение и инкапсуляция того, что *изменяется*, позволяет избежать влияния на работу остального кода 
    при внесении изменений и расширении функциональных возможностей приложения.
2. **Программируйте на уровне интерфейса, а не на уровне реализации**
3. **Отдавайте предпочтение композиции перед наследованием**

   Системы, созданные на основе *композиции*, обладают значительно большей *гибкостью*. Они
   позволяют не только инкапсулировать *семейства алгоритмов*, но и изменять поведение во время выполнения — при
   условии, что объект, подключенный посредством композиции, реализует правильный интерфейс.
   Композиция используется во многих паттернах проектирования.
4. **Стремитесь к слабой связанности взаимодействующих объектов**
   
   На базе слабосвязанных архитектур строятся гибкие объектно-ориентированные системы, которые хорошо адаптируются к изменениям 
   благодаря минимальным зависимостям между объектами.
5. **Классы должны быть открыты для расширения, но закрыты для изменения.**

   Под расширением понимается возможность расширения функциональных возможностей класса (добавление нового поведения). 
   Под изменением - необходимость внесения изменений в этот самый класс.
   Если в класс не вносить изменения, то можно не беспокоиться за его работу - он наверняка оттестирован и работает правильно.
   Повсеместное использование данного подхода ведёт к запутыванию кода, лучше его использовать только в тех частях системы, 
   которые с наибольшей вероятностью будут изменяться в будущем.
6. **Принцип инверсии зависимостей. Код должен зависеть от абстракций, а не от конкретных классов.**

   Когда клиент создаёт конкретный экземпляр класса (реализацию) можно говорить, что клиент зависит от создаваемого класса.
   Любые изменения в конкретных классах могут привести к изменению кода клиента.
   Цель данного принципа - сокращение зависимостей.
   Принцип инверсии зависимостей напоминает принцип *Программируйте на уровне интерфейсов*. Но он предъявляет более жесткие требования.
   Он требует, чтобы высокоуровневые компоненты не зависели от низкоуровневых компонентов - вместо этого и те и другие должны зависеть от абстракций.
   *Высокоуровневым* компонентом называется класс, поведение которого определяется в контексте других, *низкоуровневых*, компонентов.
   Обычно высокоуровневым компонентом выступает клиент, а низкоуровневым - объекты, которыми он оперирует.
   *Инверсия* в названии принципа объясняется тем, что этот принцип инвертирует традиционный подход к ОО-проектированию.
   После применения принципа низкоуровневые компоненты зависят от абстракции более высокого уровня. 
   Высокоуровневый компонент тоже привязывается к той же абстракции. До применения принципа высокоуровневый компонент зависел от низкоуровневых компонентов.
   
   Советы по применению принципа:
   * Ссылки на конкретные классы не должны храниться в переменных (При использовании new сохраняется ссылка на конкретный класс. Используйте фабрику!).
   * В архитектуре не должно быть классов, производных от конкретных классов (Наследование от конкретного класса создает зависимость от него. 
     Определяйте классы производными от абстракций — интерфейсов или абстрактных классов).
   * Ни один метод не должен переопределять реализованный метод любого из его базовых классов (Если вы переопределяете реализованный метод, значит, 
     базовый класс был плохой абстракцией. Методы, реализованные в базовом классе, должны использоваться всеми субклассами).

7. **Принцип минимальной информированности. Взаимодействие между объектами должно быть сокращено до нескольких близких "друзей".**

   При проектировании системы для любого объекта следует обратить особое внимание на количество классов, с которыми
   он взаимодействует, и на то, каким образом организовано это взаимодействие.
   Этот принцип препятствует созданию архитектур с большим количеством тесно связанных классов, в которых изменение в одной 
   части системы каскадно распространяется в другие части. При формировании многочисленных зависимостей между классами система 
   теряет гибкость и становится сложной для понимания, а затраты на ее сопровождение возрастают.
   Согласно принципу из любого метода должны вызываться методы, принадлежащие:
   * самому объекту; 
   * объектам, переданным в параметрах метода; 
   * любому объекту, созданному внутри метода; 
   * любым компонентам (полям) объекта.

   Преимуществами данного принципа являются: снижение зависимостей классов и упрощение сопровождения.
   Недостатками - усложнение кода за счёт реализации множества классов-обёрток, снижение производительности. 
   
    

## Паттерны
* [**Стратегия**](./src/main/java/ru/learn/patterns/strategy/Readme.md) 
* [**Наблюдатель**](./src/main/java/ru/learn/patterns/observer/Readme.md) 
* [**Декоратор**](./src/main/java/ru/learn/patterns/decorator/Readme.md) 
* [**Фабрика**](./src/main/java/ru/learn/patterns/factory/Readme.md) 
* [**Singleton**](./src/main/java/ru/learn/patterns/singleton/Readme.md) 
* [**Команда**](./src/main/java/ru/learn/patterns/command/Readme.md) 
* [**Адаптер**](./src/main/java/ru/learn/patterns/adapter/Readme.md) 
* [**Фасад**](./src/main/java/ru/learn/patterns/facade/Readme.md) 

    
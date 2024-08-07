# Паттерн Шаблонный Метод

Задает «скелет» алгоритма в методе, оставляя определение реализации некоторых шагов подклассам. Подклассы могут 
переопределять некоторые части алгоритма без изменения его структуры.

Основной задачей паттерна является создание шаблона алгоритма. Один или несколько шагов определяются в виде абстрактных 
методов, реализуемых подклассами. Таким образом гарантируется неизменность структуры алгоритма, 
при том что часть реализации предоставляется подклассам.

Также есть методы-перехватчики - методы, предоставляющие возможность подклассам внедрить дополнительную (необязательную) логику в основной алгоритм. 
Абстрактный класс предоставляет их реализацию по умолчанию. Соответственно, подклассам не обязательно реализовывать метод-перехватчик. 
А вот методы, которые являются шагами алгоритма в абстрактном классе, объявляются абстрактными, что делает реализацию в подклассах обязательной.

В реальном коде паттерны редко встречаются в чистом виде. Так, например, паттерн шаблонный метод может встречаться в некоторых
алгоритмах сортировки без использования наследования. В таких алгоритмах используется сравнение объектов посредством
вызова у них метода compareTo() интерфейса Comparable. В таком случае шаг алгоритма сортировки - сравнение - делегируется другому компоненту.
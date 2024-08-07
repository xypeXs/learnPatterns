# Паттерн Фасад

Предоставляет унифицированный интерфейс к группе интерфейсов подсистемы. Фасад определяет высокоуровневый интерфейс, 
упрощающий работу с подсистемой.

При использовании паттерна *Фасад* создаётся класс, который упрощает и унифицирует набор более
сложных классов, образующих некую подсистему. В отличие от многих других паттернов, Фасад относительно прост; 
в нем нет сложных абстракций. Но от этого он не становится менее полезным; паттерн Фасад предотвращает появление сильных
связей между клиентом и подсистемой и позволяет заменять реализацию компонентов подсистемы (или всей подсистемы)
без внесения изменения в код клиента.

Паттерн предоставляет удобный интерфейс к набору классов (подсистеме). При этом, клиент не ограничен этим интерфейсом,
а может напрямую использовать конкретные классы (компоненты подсистемы).
Паттерн позволяет создавать множество фасадов.
Паттерн *Фасад* похож на паттерн адаптер, но есть важное отличие в целях этих паттернов: 
*Адаптер* - преобразует интерфейс класса (или набора классов) к целевому для клиента,
*Фасад* - упрощает взаимодействие клиента с подсистемой (набором классов).
# Домашнее задание к занятию «Объектно-ориентированное программирование и проектирование»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

Все задачи этого занятия можно делать в одном репозитории.

**Важно**: если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

Вы можете делать все задачи этого занятия в одном репозитории (если делаете их последовательно).

Напоминалку по некоторым теоретическим моментам в джаве вы можете найти [здесь](../tips/tips.md).

## Как сдавать задачи

1. Инициализируйте на своём компьютере пустой Git-репозиторий
1. Добавьте в него готовый файл [.gitignore](../.gitignore)
1. Добавьте в этот же каталог необходимые файлы
1. Сделайте необходимые коммиты
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым
1. Сделайте пуш (удостоверьтесь, что ваш код появился на GitHub)
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru)
1. Задачи, отмеченные, как необязательные, можно не сдавать, это не повлияет на получение зачета (в этом ДЗ все задачи являются обязательными)

## Задача №1 - "Радиоман"

### Легенда

В рамках проекта по созданию "Умного дома" у нас появился очень важный клиент, которых хочет кастомную доработку: он очень любит радио, поэтому нам нужно научиться управлять радио.

Что нужно сделать: по аналогии с кондиционером создайте класс `Radio`, в котором храните следующие поля (т.е. данные, которые будут помнить о себе объекты радио):
1. Номер текущей (прослушиваемой) радиостанции
1. Громкость звука

Требования к работе с радиостанциями:
1. Номер текущей радиостанции изменяется в пределах от 0 до 9
1. Если текущая радиостанция - 9 и клиент нажал на кнопку `next` (следующая) на пульте, то текущей должна стать 0-ая; в остальных случаях радио переключается просто на следующую станцию. (создайте отдельный метод для этой операции)
1. Если текущая радиостанция - 0 и клиент нажал на кнопку `prev` (предыдущая) на пульте, то текущей должна стать 9-ая; в остальных случаях радиопереключается просто на предыдущую станцию/ (создайте отдельный метод для этой операции)
1. Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера (сделайте сеттер с проверкой на допустимость номера станции)

Требования к работе с уровнем громкости звука:
1. Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)*
1. Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на `+` не должно ни к чему приводить (создайте отдельный метод для этой операции, см. ниже пример)
1. Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на `-` не должно ни к чему приводить (создайте отдельный метод для этой операции)

Примечание*: на следующей паре мы поговорим, почему здесь 10

**Важно**: один вызов метода должен приводить к переключению на одну радиостанцию!

Пример реализации метода увеличения звука на 1 (остальные методы переключения на 1 текущей станции или звука сделайте самостоятельно по аналогии):
```java
public class Radio {
  ...
  
  public void increaseVolume() {
    if (currentVolume < 10) {
      currentVolume = currentVolume + 1;
    }
  }
}
```

Создайте на базе проекта с лекции собственный проект (вы можете использовать проект из предыдущей задачи), в котором:
1. Подключите плагин Surefire так, чтобы сборка падала в случае отсутсвия тестов
1. Подключите плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно)
1. Реализуйте нужные классы и методы
1. Напишите автотесты на методы, содержащие логику, добившись 100% покрытия по branch'ам
1. Подключите CI на базе Github Actions и выложите всё на Github

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.
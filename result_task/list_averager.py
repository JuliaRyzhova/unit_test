# Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел
# и выполняет следующие действия:
#
# a. Рассчитывает среднее значение каждого списка.
# b. Сравнивает эти средние значения и выводит соответствующее сообщение:
# - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
# - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
# - ""Средние значения равны"", если средние значения списков равны.

from statistics import mean
from typing import List


class ListAverager:
    def __init__(self, first_list: List, second_list: List) -> None:
        self.__first_list: List = first_list
        self.__second_list: List = second_list
        self.__average_first_list: float = None
        self.__average_second_list: float = None

    @property
    def first_list(self) -> List:
        return self.__first_list

    @property
    def second_list(self) -> List:
        return self.__second_list

    @property
    def average_first_list(self) -> float:
        if self.__average_first_list is None:
            self.__average_first_list = mean(self.__first_list)
        return self.__average_first_list

    @property
    def average_second_list(self) -> float:
        if self.__average_second_list is None:
            self.__average_second_list = mean(self.__second_list)
        return self.__average_second_list

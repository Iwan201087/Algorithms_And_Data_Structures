package Lists;

public interface AbstractList extends Iterable<Integer>{
    /**
     * Добавляет число в начало списка
     * @param value - число, которое нужно добавить
     * */
    void addBegin(int value);
    /**
     * Добавляет число в конец списка
     * @param value - число, которое нужно добавить
     * */
    void addEnd(int value);
    /**
     * Удаляет элемент из начала списка, удаление элемента из пустого списка не имеет эффекта
     * */
    void removeBegin();
    /**
     * Удаляет элемент из конца пустого списка, удаление элемента из пустого списка не имеет эффекта
     * */
    void removeEnd();

}
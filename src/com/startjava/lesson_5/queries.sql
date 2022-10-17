-- вывод всей таблицы
SELECT * FROM jaegers;

-- отобразить только не уничтоженных роботов
SELECT * FROM jaegers WHERE status = 'Active';

-- отобразить роботов серий Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- сортировка таблицы по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- отобразить самого старого робота
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- отобразить роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers) OR kaijukill = (SELECT MIN(kaijukill) FROM jaegers);

-- отобразить средний вес роботов
SELECT AVG(weight) FROM jaegers;

-- увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Active';

-- удалить уничтоженных роботов
DELETE FROM jaegers WHERE status = 'Destroyed';
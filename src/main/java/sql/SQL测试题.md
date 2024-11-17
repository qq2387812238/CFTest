第11题：

使用自连接+临时表

```sql
CREATE TEMPORARY TABLE IF NOT EXISTS ClassRankings AS
SELECT
    s1.student_id,
    s1.student_name,
    s1.class_id,
    s1.score,
    (
        SELECT
            COUNT(DISTINCT s2.score) + 1
        FROM
            StudentScores s2
        WHERE
            s2.class_id = s1.class_id
            AND s2.score > s1.score
    ) AS ranking
FROM
    StudentScores s1;

SELECT
    student_name,
    score,
    class_id
FROM
    ClassRankings
WHERE
    ranking <= 3
ORDER BY
    class_id,
    score DESC;
DROP TEMPORARY TABLE IF EXISTS ClassRankings;
```

第18题

事务1

```sql
BEGIN;
SELECT * FROM `account`;
UPDATE account SET money=money+500 WHERE id = 1;
SELECT * FROM `account`;
COMMIT;
ROLLBACK;
```

事务2

```sql
BEGIN;
SELECT * FROM `account`;
UPDATE account SET money=money-500 WHERE id = 2;
SELECT * FROM `account`;
COMMIT;
ROLLBACK;
```

第19题

```sql
SELECT
    DATE_FORMAT(access_time, '%H') AS hour,
    COUNT(DISTINCT user_id) AS active_user_count
FROM
    AccessLogs
GROUP BY
    DATE_FORMAT(access_time, '%H')
ORDER BY
    hour;
```


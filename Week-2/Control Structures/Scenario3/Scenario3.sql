BEGIN
  FOR rec IN (
    SELECT c.name, l.due_date
    FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Dear ' || rec.name || ', your loan is due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY')
    );
  END LOOP;
END;

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    DECLARE
        current_balance NUMBER;
    BEGIN
        SELECT balance INTO current_balance
        FROM accounts
        WHERE account_id = from_account;

        IF current_balance < amount THEN
            RAISE insufficient_balance;
        END IF;
    END;

    -- Perform transfer
    UPDATE accounts SET balance = balance - amount WHERE account_id = from_account;
    UPDATE accounts SET balance = balance + amount WHERE account_id = to_account;

    COMMIT;

EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: One of the account IDs not found.');
END;

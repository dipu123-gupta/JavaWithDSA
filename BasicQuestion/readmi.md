# 🧠 Logic (Simple Steps)

1. Index ko **0 se start karo** (rightmost bit = index 0)
2. Jab tak number > 0:
   - Last bit nikaalo (0 ya 1)
   - Agar bit = 1:
     - Check karo index even hai ya odd
     - Even → evenCount++
     - Odd → oddCount++

3. Number ko divide by 2 (ya right shift) karo
4. Index ko increment karo
5. End me `[evenCount, oddCount]` return karo

---

# 🔑 Core Idea

👉 **Right se bits nikaalte jao + index track karo + sirf 1 count karo**

---

# 🪜 Pseudocode

```text
START

input n

evenCount = 0
oddCount = 0
index = 0

WHILE n > 0 DO
    bit = n % 2   // last bit

    IF bit == 1 THEN
        IF index % 2 == 0 THEN
            evenCount = evenCount + 1
        ELSE
            oddCount = oddCount + 1
        ENDIF
    ENDIF

    n = n / 2     // shift right
    index = index + 1

END WHILE

PRINT evenCount, oddCount

END
```

---

# 🎯 One-Line Memory Trick

👉 **Bit nikalo → index check karo → count karo → shift karo**

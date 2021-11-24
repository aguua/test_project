# Zadanie: Projekt końcowy

---
## System zamawiania posiłku przez aplikację

### Wykorzystane wzorce

#### Konstrukcyjne

- Singleton  - ItalianMealFactory, MexicanMeanFactory, MexicanRestaurant, ItalianRestaurant
- Factory Method - zwraca odopowienie posiłki w zależności od rodzaju restauracji i podanego numeru z menu

#### Strukturalne

- Facade - logika realizowania płatności za zamówienie, oddziela system transakcyjny od samej aplikacji 

#### Operacyjne

- Observer - obserwator :  MobileApp, obiekt obserwowany: Order - aplikacja obserwuje zmiany zamówienia
- Template method - definiuje kolejne etapy zamówienia posiłku.  szablon kroków : orderMeal()

---
| Termin oddania | Punkty     |
|----------------|:-----------|
| 10.06.2021  23:00   |    20      |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskanie za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

W ramach projektu końcowego należy przedstawić rozwiązanie dowolnego problemu, 
w którym w nietrywialny sposób zastosowano po dwa wzorce 
projektowe z następujących grup:
* kreacyjne
* strukturalne
* czynnościowe.

Łącznie trzeba zaprezentować sześć wzorców, które współpracują w jednym projekcie.

Oceniane będą:
* trafność doboru wzorców
* jakość implementacji
* nietrywialność informatyczna wybranego problemu rozwiązywanego przez projekt.

### Uwaga
Projekt powinien również zawierać: 
* odpowiednie testy jednostkowe do implementowanej funkcjonalności
* testy wydajnościowe potwierdzające trafność doboru wzorców.

# Counter 이해하기
* Python이 제공하는 collections 라는 모듈의 한 class이다.
* 컨테이너(dict, list, set, tuple)에 동일한 값의 자료가 몇개인지를 파악하는데 사용합니다. 
* collections.Counter()의 결과값(return)은 딕셔너리 형태로 출력된다.

## collections.Counter()의 뺄셈
~~~python 
import collections
a = collections.Counter('aabbccdd')
b = collections.Counter('abbbce')
print(a-b)

# 결과
# Counter({'d': 2, 'c': 1, 'a': 1})
~~~



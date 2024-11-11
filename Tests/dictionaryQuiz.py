print("Q")
d = {"name": "Alice", "age": 20, "major": "Physics"}
print(d["major"])
d["major"] = "Computer Science"
print(d["major"])
print(d.keys())

print("Q")
del d["major"]
print(d.items())

print("Q")
d2 = {"x": 10, "y": 20, "z": 30}
print("y" in d2)
print(len(d2))

print("Q")
d3 = {x: x * x for x in range(1,6)}
print(d3)

print("Q")
print(d.pop("name"))
print(d)

print("Q")
d4 = {"a": 1, "b": 2, "c": 3}
d["test"] = d4
print(d)

print("Q")
d5 = d.copy()
del d["test"]
print(d5)
print(d)
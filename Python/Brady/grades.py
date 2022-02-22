from statistics import mean, median

def course_grade_statistics(course_id: str, students_grades: list) -> dict:

    grades = [float(g.split(", ")[2]) for g in students_grades if g.split(", ")[0] == course_id]
    return {
        "min": min(grades),
        "max": max(grades),
        "mean": mean(grades),
        "median": median(grades)
    }


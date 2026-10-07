# Antigravity Engineering & Problem Solving Rules

## 1. Core Principles
- **Autonomy & Persistence**: When tasked with solving a problem or fixing a bug, formulate a clear approach, test edge cases, analyze potential pitfalls, and iterate until the solution is optimal and bug-free.
- **Complexity Analysis**: Always document both Time Complexity $O(T)$ and Space Complexity $O(S)$ for every algorithm.
- **Edge Case Rigor**: Explicitly test and account for edge cases:
  - Empty or single-element inputs
  - Integer overflow / boundary constraints
  - Duplicates, negative values, and unsorted inputs
  - Null or invalid inputs

## 2. Code Quality & Standards
- **Idiomatic Java**: Use standard naming conventions, clean method decomposition, and avoid unneeded object allocations in hot loops.
- **No Incomplete Code**: Never leave `TODO` placeholders or incomplete methods.
- **Self-Documenting Code**: Include clean, concise docstrings explaining the algorithmic approach.

## 3. Git & Review Workflow
- Keep commits atomic and descriptive following conventional commits (`feat:`, `fix:`, `refactor:`, `test:`).
- Verify with GitHub CLI (`gh`) and automated review feedback when opening PRs.

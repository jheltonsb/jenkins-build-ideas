# jenkins-build-ideas
Visual example of jenkins ideas for a uncoupled mono repo

Each application in the monorepo is scoped in to only what concerns them.
Each jenkins file existing at the root of each project has a changeset condition that will match on the projects directory name.

If the name is matched, it will move into that directory and run all of the build steps for that project.
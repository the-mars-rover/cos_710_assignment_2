<!-- PROJECT LOGO -->
<p align="right">
<a href="https://www.up.ac.za">
<img src="https://raw.githubusercontent.com/marcus-bornman/cos_710_assignment_2/master/assets/project_badge.png" height="100" alt="badge">
</a>
</p>
<p align="center">
<img src="https://raw.githubusercontent.com/marcus-bornman/cos_710_assignment_2/master/assets/project_logo.png" height="100" alt="logo" />
</p>

<!-- PROJECT SHIELDS -->
<p align="center">
<a href="https://github.com/marcus-bornman/cos_710_assignment_2/actions?query=workflow%3Abuild"><img src="https://img.shields.io/github/workflow/status/marcus-bornman/cos_710_assignment_2/build?label=build" alt="build"></a>
<a href="https://github.com/marcus-bornman/cos_710_assignment_2/issues"><img src="https://img.shields.io/github/issues/marcus-bornman/cos_710_assignment_2" alt="issues"></a>
<a href="https://github.com/marcus-bornman/cos_710_assignment_2/network"><img src="https://img.shields.io/github/forks/marcus-bornman/cos_710_assignment_2" alt="forks"></a>
<a href="https://github.com/marcus-bornman/cos_710_assignment_2/stargazers"><img src="https://img.shields.io/github/stars/marcus-bornman/cos_710_assignment_2" alt="stars"></a>
<a href="https://google.github.io/styleguide/javaguide.html"><img src="https://img.shields.io/badge/style-google_java-40c4ff.svg" alt="style"></a>
<a href="https://github.com/marcus-bornman/cos_710_assignment_2/blob/master/LICENSE"><img src="https://img.shields.io/github/license/Marcus-bornman/cos_710_assignment_2" alt="license"></a>
</p>

---

<!-- TABLE OF CONTENTS -->
## Table of Contents
* [About the Project](#about-the-project)
* [Getting Started](#getting-started)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project
<p align="center">
<img src="https://raw.githubusercontent.com/marcus-bornman/cos_710_assignment_2/master/assets/screenshot_1.gif" width="800" alt="Screenshot 1" />
</p>

This assignment - completed as part of the COS710 (Artificial Intelligence) Honours module at the University of Pretoria -
involves employing genetic programming to produce a classifier for postoperative patient diagnosis.

See the following for detailed information about the project:
* [specification.pdf](assets/specification.pdf) - The specification for this assignment.
* [report.pdf](assets/report/report.pdf) - The report submitted for this assignment.

### Built With
* [Java](https://www.java.com/en/)
* [Apache Maven](https://maven.apache.org)



<!-- GETTING STARTED -->
## Getting Started
To build this project you will need to have Java 1.8 or later installed as well as [Apache Maven](https://maven.apache.org).

You can ensure that the project compiles by running the following command in the root folder of this project:
```
mvn clean compile assembly:single
```



<!-- USAGE EXAMPLES -->
## Usage
To reproduce the results mentioned in [the report for this assignment](assets/report/report.pdf), you simply need to run the
[reproduce.sh](results/reproduce.sh) from the root folder of this project:
```shell script
sh results/reproduce.sh
```
This will reproduce the output for 10 test runs using each of 3 genetic parameter combinations in the [results folder](results).



<!-- ROADMAP -->
## Roadmap
See the [open issues](https://github.com/marcus-bornman/cos_710_assignment_2/issues) for a list of other proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the Academic Free License. See [LICENSE](LICENSE) for more information.



<!-- CONTACT -->
## Contact

Marcus Bornman - [marcusbornman.com](https://www.marcusbornman.com) - [marcus.bornman@gmail.com](mailto:marcus.bornman@gmail.com)

Project Link: [https://github.com/marcus-bornman/cos_710_assignment_2](https://github.com/marcus-bornman/cos_710_assignment_2)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [The ECJ Team](https://cs.gmu.edu/~eclab/projects/ecj/)
* [Shields IO](https://shields.io)
* [Open Source Licenses](https://choosealicense.com)
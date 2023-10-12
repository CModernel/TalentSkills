# TalentSkills
## Description

This Android app project was created with the primary objective of helping users uncover and exhibit their hidden talents. It also provides a valuable resource for recruiters, enabling them to identify and match relevant skills when reviewing job applications. Built with Kotlin, this project strictly adheres to the MVVM architectural pattern and Clean Architecture principles, ensuring a modular, scalable, and maintainable codebase.

- **Modular Pathways:** The app is divided into three distinct pathways, facilitating targeted use and adaptability.
- **Resource for Developers:** Other Android developers have found value in this project, using it as a resource to take pathways/screens and adapt them to their own projects.

## Technologies Used

- Kotlin: The primary programming language.
- Android Jetpack: Utilized for various Android components.
  - Lifecycle
  - LiveData
  - ViewModel
  - Navigation
- MVVM Architecture: Followed to ensure a clean and maintainable codebase.
- Clean Architecture: Enforces separation of concerns and modular design.
- LiveData and ViewModel: Implemented for reactive UI updates.
- ViewBinding: For efficient view interaction.
- Coroutines: Employed for asynchronous operations.

## Screenshots 

## 1 - Purchase Screen
This screen is designed to provide users with a list of offers for the amount of talents they can unlock. This screen allows the users to choose any offer they want, including special discounts on major selections. The number of offers is dynamic and is designed to be provided via web service. By default, it is showing 4 unlockable talents. Discounts are highlighted making it easier for users to spot valuable opportunities. The screen finally redirects users to the Payment Page.

<img src="/app/images/image1-talent-purchase-offer.gif" width="30%" />

## 2 - Discover Screen
This screen serves as the initial point of engagement for users to discover their hidden talents. This screen was designed to provide users with essential information and guidance regarding the talent discovery process. This screen sets the stage for the entire experience and prominently displays an estimate of the time required to complete the talent discovery process. Additionally, users are informed about the number of questions they will be asked. 

The screen also has a floating tip section, providing comprehensive insights into the talent discovery process: 
- 	**Process Explanation:** This includes details on how questions are structured, the nature of the assessments, and the purpose of each step.
- 	**Talent Showcase:** Users are informed about where their discovered talents will be displayed within the app.
- 	**User Benefits:**  Shows to the user which are the benefits of discovering their hidden talents.
  
<div style="display: flex;">
        <img src="/app/images/image2-talent-welcome.jpeg" width="30%" />
        <img src="/app/images/image3-talent-welcome-tips.jpeg" width="30%" />
</div>

## 3 - Talent Detail Screen
This screen offers users a comprehensive and informative preview of the talent discovery process for each role, empowering them to make informed decisions about their career and personal growth. For the selected role, users are provided with a sneak peek into the talent discovery process. The screen outlines actionable steps and strategies for leveraging the talents associated with the selected role. 

<img src="/app/images/image4-talent-details.jpeg" width="30%" />

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

**Email:** chrismmodernel@gmail.com

**LinkedIn:** [Christian Modernel](https://www.linkedin.com/in/christian-modernel/)

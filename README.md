# Component Attribute Updates

This document outlines the newly added attributes for various components in both the module and JS file. 

## Overview of Changes

| **Component**             | **Newly Added Attributes in Module**                                                                                                             | **Newly Added Attributes in JS File**                                                                                                     |
|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| **CustomActionSheet**      | - `change-title-text`<br> - `change-instruction-text`<br> - `file-description`<br> - `file-icon`<br> - `file-icon-color`<br> - `file-arrow-icon`<br> - `arrowicon-color`<br> - `gallery-description`<br> - `gallery-icon`<br> - `gallery-icon-color`<br> - `gallery-arrow-icon`<br> - `show-capture-photo`<br> - `show-upload-device`<br> - `actionsheet-closeicon-src`<br> - `actionsheet-closeicon-color` | - `change-title-text`<br> - `change-instruction-text`<br> - `file-icon-color`<br> - `arrowicon-color`<br> - `gallery-icon-color`<br> - `show-capture-photo`<br> - `show-upload-device`<br> - `actionsheet-closeicon-src`<br> - `actionsheet-closeicon-color` |
| **TrackpadActionSheet**    | - `error-message-text`<br> - `labelcontainer-bg-color`<br> - `submit-button-disabled-text-color`<br> - `labelcontainer-sliding-bg-color`<br> - `labelcontainer-button-hover-color`<br> - `labelcontainer-button-active-text-color`<br> - `labelcontainer-button-inactive-text-color`<br> - `placeholder-text`<br> - `placeholder-font-color`<br> - `signature-pad-bg-color`<br> - `pen-color`<br> - `draw-button-text`<br> - `draw-button-icon-src`<br> - `autogenerate-button-text`<br> - `autogenerate-button-icon-src`<br> - `close-icon-src`<br> - `close-icon-color`<br> - `trackpad-bg-color` | - `submit-button-disabled-text-color`<br> - `error-message-text`<br> - `labelcontainer-bg-color`<br> - `labelcontainer-sliding-bg-color`<br> - `labelcontainer-button-hover-color`<br> - `labelcontainer-button-active-text-color`<br> - `labelcontainer-button-inactive-text-color`<br> - `placeholder-text`<br> - `placeholder-font-color`<br> - `signature-pad-bg-color`<br> - `close-icon-src`<br> - `close-icon-color`<br> - `pen-color`<br> - `draw-button-text`<br> - `draw-button-icon-src`<br> - `autogenerate-button-text`<br> - `autogenerate-button-icon-src`<br> - `trackpad-bg-color` |
| **CustomFooter**           | - `margin`                                                                                                                                       | - `1.hv_form_v2_MK5c5x`<br> - `2.hv_form_v2_7q6xcH`<br> - `3.hv_form_v2_ZS6hTJ`                                                          |
| **CustomSheet**            | - `title-text`<br> - `message-text`<br> - `primary-button-text`<br> - `primary-button-border-color`<br> - `error-icon-color`<br> - `sheet-background-color`<br> - `visible`<br> - `line-color`<br><br>**Removed**:<br> - `close-icon-src` | - `sheet-background-color`<br> - `title-text`<br> - `message-text`<br> - `primary-button-text`<br> - `primary-button-border-color`<br> - `error-icon-src`<br> - `error-icon-color`<br> - `line-color`<br><br>**Removed**:<br> - `icon-src` |
| **CustomWarningBox**       | - `hv_form_v2_qgBfI1`<br> - `hv_form_v2_wD0oPC`                                                                                                 | - `icon-color`<br> - `error-message`                                                                                                     |
| **SignaturePadComponent**  | - `error-message-text`<br> - `signature-pad-bg-color`<br> - `pen-color`                                                                         |                                                                                                                                           |

## Notes

1. Attributes marked under **Removed** are no longer part of the component.
2. The listed attributes may have additional dependencies or constraints; consult the documentation for further details.

Feel free to reach out for clarifications or updates!

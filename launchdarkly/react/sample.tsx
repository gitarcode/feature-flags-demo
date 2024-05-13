/*
 * Copyright (c) 2024 Gitar, Inc.
 */

import { LDClient } from "launchdarkly-js-client-sdk";

const Header = () => {
	const ldClient = LDClient.initialize("YOUR_CLIENT_SIDE_ID", {
		key: "user_key",
		name: "User Name",
	});
	const user = LDClient.User({
		key: "user_key",
		name: "User Name",
	});
	const isDarkModeEnabled = ldClient.variation(
		"is-dark-mode-enabled",
		user,
		false,
	);
	const enableHighContrast = ldClient.variation(
		"enable-high-contrast",
		user,
		true,
	);

	return (
		<div
			style={
				isDarkModeEnabled
					? { backgroundColor: "#333", color: "#fff" }
					: { backgroundColor: "#fff", color: "#000" }
			}
		>
			{isDarkModeEnabled ? (
				<div>
					Dark Mode is enabled.
					<p>Welcome to a darker, more soothing interface!</p>
					{enableHighContrast ? (
						<div>
							High Contrast mode is enabled, enhancing visual accessibility.
						</div>
					) : (
						<div>High Contrast mode is disabled.</div>
					)}
				</div>
			) : (
				<div>
					Dark Mode is disabled.
					<p>Enjoy the default light theme.</p>
					{enableHighContrast ? (
						<div>
							High Contrast mode is enabled, enhancing visual accessibility.
						</div>
					) : (
						<div>High Contrast mode is disabled.</div>
					)}
				</div>
			)}
		</div>
	);
};

export default Header;
